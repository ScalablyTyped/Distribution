package typings.activexLibreoffice.com_.sun.star.xml.xpath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Libxml2ExtensionHandle extends js.Object {
  var functionData: Double
  var functionLookupFunction: Double
  var variableData: Double
  var variableLookupFunction: Double
}

object Libxml2ExtensionHandle {
  @scala.inline
  def apply(
    functionData: Double,
    functionLookupFunction: Double,
    variableData: Double,
    variableLookupFunction: Double
  ): Libxml2ExtensionHandle = {
    val __obj = js.Dynamic.literal(functionData = functionData.asInstanceOf[js.Any], functionLookupFunction = functionLookupFunction.asInstanceOf[js.Any], variableData = variableData.asInstanceOf[js.Any], variableLookupFunction = variableLookupFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Libxml2ExtensionHandle]
  }
}

