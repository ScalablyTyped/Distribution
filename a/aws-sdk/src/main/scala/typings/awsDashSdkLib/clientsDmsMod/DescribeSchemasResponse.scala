package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSchemasResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The described schema.
    */
  var Schemas: js.UndefOr[SchemaList] = js.undefined
}

object DescribeSchemasResponse {
  @scala.inline
  def apply(Marker: String = null, Schemas: SchemaList = null): DescribeSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas)
    __obj.asInstanceOf[DescribeSchemasResponse]
  }
}

