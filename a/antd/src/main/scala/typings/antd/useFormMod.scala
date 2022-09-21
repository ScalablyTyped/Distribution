package typings.antd

import typings.antd.anon.ItemRef
import typings.rcFieldForm.interfaceMod.NamePath
import typings.scrollIntoViewIfNeeded.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormMod {
  
  @JSImport("antd/lib/form/hooks/useForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[FormInstance[Values]]]
  inline def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  @js.native
  trait FormInstance[Values]
    extends StObject
       with typings.rcFieldForm.interfaceMod.FormInstance[Values] {
    
    /** This is an internal usage. Do not use in your prod */
    var __INTERNAL__ : ItemRef = js.native
    
    def getFieldInstance(name: NamePath): Any = js.native
    
    def scrollToField(name: NamePath): Unit = js.native
    def scrollToField(name: NamePath, options: Options[Any]): Unit = js.native
  }
}
