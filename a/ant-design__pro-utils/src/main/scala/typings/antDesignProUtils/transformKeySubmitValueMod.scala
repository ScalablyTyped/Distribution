package typings.antDesignProUtils

import typings.antDesignProUtils.typingMod.SearchTransformKeyFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformKeySubmitValueMod {
  
  @JSImport("@ant-design/pro-utils/es/transformKeySubmitValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPlainObj(itemValue: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObj")(itemValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def transformKeySubmitValue[T /* <: js.Object */](values: T, dataFormatMapRaw: Record[String, js.UndefOr[SearchTransformKeyFn | DataFormatMapType]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transformKeySubmitValue")(values.asInstanceOf[js.Any], dataFormatMapRaw.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def transformKeySubmitValue[T /* <: js.Object */](
    values: T,
    dataFormatMapRaw: Record[String, js.UndefOr[SearchTransformKeyFn | DataFormatMapType]],
    omit: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transformKeySubmitValue")(values.asInstanceOf[js.Any], dataFormatMapRaw.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type DataFormatMapType = Record[String, js.UndefOr[SearchTransformKeyFn]]
}
