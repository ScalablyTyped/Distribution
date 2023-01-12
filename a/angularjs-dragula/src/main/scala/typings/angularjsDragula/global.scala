package typings.angularjsDragula

import typings.angular.mod.IAngularStatic
import typings.angular.mod.IScope
import typings.angularjsDragula.angularjsDragulaStrings.dragula
import typings.angularjsDragula.anon.ReadonlyBag
import typings.dragula.mod.DragulaOptions
import typings.dragula.mod.Drake
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object angularDragula {
    
    inline def apply(angular: IAngularStatic): dragula = ^.asInstanceOf[js.Dynamic].apply(angular.asInstanceOf[js.Any]).asInstanceOf[dragula]
    
    @JSGlobal("angularDragula")
    @js.native
    val ^ : js.Any = js.native
    
    /* augmented module */
    object angularMod {
      
      object dragula {
        
        /**
          * Grouping of containers is called a bag.
          */
        trait Bag extends StObject {
          
          var drake: Drake
          
          var name: String
        }
        object Bag {
          
          inline def apply(drake: Drake, name: String): Bag = {
            val __obj = js.Dynamic.literal(drake = drake.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
            __obj.asInstanceOf[Bag]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: Bag] (val x: Self) extends AnyVal {
            
            inline def setDrake(value: Drake): Self = StObject.set(x, "drake", value.asInstanceOf[js.Any])
            
            inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          }
        }
        
        /**
          * This service exposes a few different methods with which you can interact with `dragula` in the Angular way.
          */
        @js.native
        trait DragulaService extends StObject {
          
          /**
            * Creates a `bag` scoped under `scope` and identified by `name`. You should provide the entire `drake` instance.
            * Typically, the directive takes care of this step.
            */
          def add(scope: IScope, name: String, drake: Drake): typings.angularjsDragula.mod.angularAugmentingMod.dragula.Bag = js.native
          
          /**
            * Destroys a `drake` instance named `name` scoped under `scope`.
            */
          def destroy(scope: IScope, name: String): Unit = js.native
          
          /**
            * Returns the `bag` for a s`drake` instance
            */
          def find(scope: IScope, name: String): js.UndefOr[ReadonlyBag] = js.native
          
          /**
            * models to sync with
            */
          def handleModels(scope: IScope, drake: Drake): Unit = js.native
          
          /**
            * Sets the `options` used to instantiate a `drake`.
            * Refer to the documentation for `dragula` to learn more about the options themselves.
            */
          def options(scope: IScope, name: String): Unit = js.native
          def options(scope: IScope, name: String, options: DragulaOptions): Unit = js.native
        }
      }
    }
  }
}
