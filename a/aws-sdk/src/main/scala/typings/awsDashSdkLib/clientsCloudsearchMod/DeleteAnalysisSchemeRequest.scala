package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAnalysisSchemeRequest extends js.Object {
  /**
    * The name of the analysis scheme you want to delete.
    */
  var AnalysisSchemeName: StandardName
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
}

object DeleteAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisSchemeName: StandardName, DomainName: DomainName): DeleteAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisSchemeName = AnalysisSchemeName, DomainName = DomainName)
  
    __obj.asInstanceOf[DeleteAnalysisSchemeRequest]
  }
}

