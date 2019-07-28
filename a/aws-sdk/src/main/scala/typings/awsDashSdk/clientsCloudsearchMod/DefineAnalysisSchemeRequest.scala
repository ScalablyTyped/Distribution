package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineAnalysisSchemeRequest extends js.Object {
  var AnalysisScheme: typings.awsDashSdk.clientsCloudsearchMod.AnalysisScheme
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
}

object DefineAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisScheme: AnalysisScheme, DomainName: DomainName): DefineAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme, DomainName = DomainName)
  
    __obj.asInstanceOf[DefineAnalysisSchemeRequest]
  }
}

