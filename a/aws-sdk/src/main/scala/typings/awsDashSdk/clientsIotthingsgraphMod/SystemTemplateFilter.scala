package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemTemplateFilter extends js.Object {
  /**
    * The name of the system search filter field.
    */
  var name: SystemTemplateFilterName
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: SystemTemplateFilterValues
}

object SystemTemplateFilter {
  @scala.inline
  def apply(name: SystemTemplateFilterName, value: SystemTemplateFilterValues): SystemTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[SystemTemplateFilter]
  }
}

