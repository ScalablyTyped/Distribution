package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object test {
  
  type UITest = XUITest
  
  trait XUIObject extends StObject {
    
    val Children: SafeArray[String]
    
    val State: PropertyValues
    
    val Type: String
    
    def executeAction(action: String, propValues: PropertyValues): Unit
    
    def getChild(id: String): XUIObject
    
    def getChildren(): SafeArray[String]
    
    def getState(): PropertyValues
    
    def getType(): String
  }
  object XUIObject {
    
    inline def apply(
      Children: SafeArray[String],
      State: PropertyValues,
      Type: String,
      executeAction: (String, PropertyValues) => Unit,
      getChild: String => XUIObject,
      getChildren: () => SafeArray[String],
      getState: () => PropertyValues,
      getType: () => String
    ): XUIObject = {
      val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], executeAction = js.Any.fromFunction2(executeAction), getChild = js.Any.fromFunction1(getChild), getChildren = js.Any.fromFunction0(getChildren), getState = js.Any.fromFunction0(getState), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[XUIObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XUIObject] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: SafeArray[String]): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
      
      inline def setExecuteAction(value: (String, PropertyValues) => Unit): Self = StObject.set(x, "executeAction", js.Any.fromFunction2(value))
      
      inline def setGetChild(value: String => XUIObject): Self = StObject.set(x, "getChild", js.Any.fromFunction1(value))
      
      inline def setGetChildren(value: () => SafeArray[String]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetState(value: () => PropertyValues): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setState(value: PropertyValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateVarargs(value: PropertyValue*): Self = StObject.set(x, "State", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait XUITest extends StObject {
    
    val TopFocusWindow: XUIObject
    
    def executeCommand(command: String): Unit
    
    def getTopFocusWindow(): XUIObject
  }
  object XUITest {
    
    inline def apply(TopFocusWindow: XUIObject, executeCommand: String => Unit, getTopFocusWindow: () => XUIObject): XUITest = {
      val __obj = js.Dynamic.literal(TopFocusWindow = TopFocusWindow.asInstanceOf[js.Any], executeCommand = js.Any.fromFunction1(executeCommand), getTopFocusWindow = js.Any.fromFunction0(getTopFocusWindow))
      __obj.asInstanceOf[XUITest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XUITest] (val x: Self) extends AnyVal {
      
      inline def setExecuteCommand(value: String => Unit): Self = StObject.set(x, "executeCommand", js.Any.fromFunction1(value))
      
      inline def setGetTopFocusWindow(value: () => XUIObject): Self = StObject.set(x, "getTopFocusWindow", js.Any.fromFunction0(value))
      
      inline def setTopFocusWindow(value: XUIObject): Self = StObject.set(x, "TopFocusWindow", value.asInstanceOf[js.Any])
    }
  }
}
