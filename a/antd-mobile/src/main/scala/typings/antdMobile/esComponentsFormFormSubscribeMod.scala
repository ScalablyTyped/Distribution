package typings.antdMobile

import typings.antdMobile.anon.Form
import typings.rcFieldForm.esInterfaceMod.FormInstance
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.react.mod.FC
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFormFormSubscribeMod {
  
  @JSImport("antd-mobile/es/components/form/form-subscribe", "FormSubscribe")
  @js.native
  val FormSubscribe: FC[FormSubscribeProps] = js.native
  
  @JSImport("antd-mobile/es/components/form/form-subscribe", "Watcher")
  @js.native
  val Watcher: NamedExoticComponent[Form] = js.native
  
  type ChildrenType[Values] = RenderChildren[Values]
  
  trait FormSubscribeProps extends StObject {
    
    var children: ChildrenType[Any]
    
    var to: js.Array[NamePath]
  }
  object FormSubscribeProps {
    
    inline def apply(
      children: (/* changedValues */ Record[String, Any], /* form */ FormInstance[Any]) => ReactNode,
      to: js.Array[NamePath]
    ): FormSubscribeProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSubscribeProps]
    }
    
    extension [Self <: FormSubscribeProps](x: Self) {
      
      inline def setChildren(value: (/* changedValues */ Record[String, Any], /* form */ FormInstance[Any]) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setTo(value: js.Array[NamePath]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: NamePath*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  type RenderChildren[Values] = js.Function2[/* changedValues */ Record[String, Any], /* form */ FormInstance[Values], ReactNode]
}
