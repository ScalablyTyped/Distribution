package typings.antvG2plot

import typings.antvG2plot.libTypesCommonMod.Data
import typings.antvG2plot.libTypesMetaMod.Meta
import typings.antvG2plot.libTypesRelationDataMod.NodeLinkData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDataMod {
  
  @JSImport("@antv/g2plot/lib/utils/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustYMetaByZero(data: Data, field: String): Meta = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustYMetaByZero")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Meta]
  
  inline def processIllegalData(data: js.Array[Record[String, Any]], field: String): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("processIllegalData")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def transformDataToNodeLinkData(data: Data, sourceField: String, targetField: String, weightField: String): NodeLinkData = (^.asInstanceOf[js.Dynamic].applyDynamic("transformDataToNodeLinkData")(data.asInstanceOf[js.Any], sourceField.asInstanceOf[js.Any], targetField.asInstanceOf[js.Any], weightField.asInstanceOf[js.Any])).asInstanceOf[NodeLinkData]
  inline def transformDataToNodeLinkData(
    data: Data,
    sourceField: String,
    targetField: String,
    weightField: String,
    rawFields: js.Array[String]
  ): NodeLinkData = (^.asInstanceOf[js.Dynamic].applyDynamic("transformDataToNodeLinkData")(data.asInstanceOf[js.Any], sourceField.asInstanceOf[js.Any], targetField.asInstanceOf[js.Any], weightField.asInstanceOf[js.Any], rawFields.asInstanceOf[js.Any])).asInstanceOf[NodeLinkData]
}
