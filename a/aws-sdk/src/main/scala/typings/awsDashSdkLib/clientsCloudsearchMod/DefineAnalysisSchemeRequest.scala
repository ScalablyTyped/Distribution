package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineAnalysisSchemeRequest extends js.Object {
  var AnalysisScheme: awsDashSdkLib.clientsCloudsearchMod.AnalysisScheme
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
}

object DefineAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisScheme: AnalysisScheme, DomainName: DomainName): DefineAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme, DomainName = DomainName)
  
    __obj.asInstanceOf[DefineAnalysisSchemeRequest]
  }
}

