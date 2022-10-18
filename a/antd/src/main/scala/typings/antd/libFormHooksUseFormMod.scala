package typings.antd

import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.scrollIntoViewIfNeeded.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormHooksUseFormMod {
  
  @JSImport("antd/lib/form/hooks/useForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[FormInstance[Values]]]
  inline def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  @js.native
  trait FormInstance[Values]
    extends StObject
       with typings.rcFieldForm.esInterfaceMod.FormInstance[Values] {
    
    def getFieldInstance(name: NamePath): Any = js.native
    
    def scrollToField(name: NamePath): Unit = js.native
    def scrollToField(name: NamePath, options: Options[Any]): Unit = js.native
  }
}
