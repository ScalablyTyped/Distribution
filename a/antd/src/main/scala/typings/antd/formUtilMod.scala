package typings.antd

import typings.antd.antdBooleans.`false`
import typings.rcFieldForm.interfaceMod.InternalNamePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formUtilMod {
  
  @JSImport("antd/lib/form/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFieldId(namePath: InternalNamePath): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldId")(namePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getFieldId(namePath: InternalNamePath, formName: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldId")(namePath.asInstanceOf[js.Any], formName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def toArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[T]]
  inline def toArray[T](candidate: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(candidate.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](candidate: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(candidate.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toArray_false[T](candidate: `false`): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(candidate.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
