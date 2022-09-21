package typings.angularWizard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object mgoAngularWizard {
    
    @js.native
    trait Wizard extends StObject {
      
      def addStep(step: WzStep): Unit = js.native
      
      def cancel(): Unit = js.native
      
      def currentStep(): WzStep = js.native
      
      def currentStepDescription(): String = js.native
      
      def currentStepNumber(): Double = js.native
      
      def currentStepTitle(): String = js.native
      
      def finish(): Unit = js.native
      
      def getEnabledSteps(): js.Array[WzStep] = js.native
      
      def goTo(step: String): Unit = js.native
      def goTo(step: Double): Unit = js.native
      
      def next(): Unit = js.native
      def next(nextHandler: js.Function0[Boolean]): Unit = js.native
      
      def previous(): Unit = js.native
      
      def reset(): Unit = js.native
      
      /** Set the edit mode of the wizard.
        * Setting editMode to `true` will make ALL steps accessible,
        * setting edit mode to `false` will make all steps with an index lower than
        * the latest "completed" step accessible.
        */
      def setEditMode(editMode: Boolean): Unit = js.native
      
      def totalStepCount(): Double = js.native
    }
    
    @js.native
    trait WizardHandler extends StObject {
      
      def addWizard(name: String, wizard: Wizard): Unit = js.native
      
      def removeWizard(name: String): Unit = js.native
      
      def wizard(): Wizard = js.native
      def wizard(name: String): Wizard = js.native
    }
    
    trait WzStep extends StObject {
      
      def canenter(args: Any*): Boolean
      
      def canexit(args: Any*): Boolean
      
      var description: String
      
      var selected: Boolean
      
      var title: String
      
      var wzData: Any
      
      var wzTitle: String
    }
    object WzStep {
      
      inline def apply(
        canenter: /* repeated */ Any => Boolean,
        canexit: /* repeated */ Any => Boolean,
        description: String,
        selected: Boolean,
        title: String,
        wzData: Any,
        wzTitle: String
      ): WzStep = {
        val __obj = js.Dynamic.literal(canenter = js.Any.fromFunction1(canenter), canexit = js.Any.fromFunction1(canexit), description = description.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wzData = wzData.asInstanceOf[js.Any], wzTitle = wzTitle.asInstanceOf[js.Any])
        __obj.asInstanceOf[WzStep]
      }
      
      extension [Self <: WzStep](x: Self) {
        
        inline def setCanenter(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "canenter", js.Any.fromFunction1(value))
        
        inline def setCanexit(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "canexit", js.Any.fromFunction1(value))
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setWzData(value: Any): Self = StObject.set(x, "wzData", value.asInstanceOf[js.Any])
        
        inline def setWzTitle(value: String): Self = StObject.set(x, "wzTitle", value.asInstanceOf[js.Any])
      }
    }
  }
}
