package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.eventsMod.AgEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agCheckboxMod {
  
  @JSImport("ag-grid/dist/lib/widgets/agCheckbox", "AgCheckbox")
  @js.native
  class AgCheckbox () extends Component {
    
    var eChecked: js.Any = js.native
    
    var eIndeterminate: js.Any = js.native
    
    var eLabel: js.Any = js.native
    
    var eUnchecked: js.Any = js.native
    
    def getNextValue(): Boolean = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def isReadOnly(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    /* private */ def loadIcons(): js.Any = js.native
    
    /* private */ def onClick(event: js.Any): js.Any = js.native
    
    var passive: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    /* private */ def preConstruct(): js.Any = js.native
    
    var props: js.Any = js.native
    
    var readOnly: js.Any = js.native
    
    var selected: js.Any = js.native
    
    def setPassive(passive: Boolean): Unit = js.native
    
    def setReadOnly(readOnly: Boolean): Unit = js.native
    
    def setSelected(selected: Boolean): Unit = js.native
    
    def toggle(): Unit = js.native
    
    /* private */ def updateIcons(): js.Any = js.native
  }
  /* static members */
  object AgCheckbox {
    
    @JSImport("ag-grid/dist/lib/widgets/agCheckbox", "AgCheckbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/widgets/agCheckbox", "AgCheckbox.EVENT_CHANGED")
    @js.native
    def EVENT_CHANGED: String = js.native
    @scala.inline
    def EVENT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/widgets/agCheckbox", "AgCheckbox.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ChangeEvent extends AgEvent {
    
    var selected: Boolean = js.native
  }
  object ChangeEvent {
    
    @scala.inline
    def apply(selected: Boolean, `type`: String): ChangeEvent = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
    
    @scala.inline
    implicit class ChangeEventMutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
