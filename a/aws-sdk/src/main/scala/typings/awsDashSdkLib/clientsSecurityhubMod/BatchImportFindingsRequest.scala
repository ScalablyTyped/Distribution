package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchImportFindingsRequest extends js.Object {
  /**
    * A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
    */
  var Findings: AwsSecurityFindingList
}

object BatchImportFindingsRequest {
  @scala.inline
  def apply(Findings: AwsSecurityFindingList): BatchImportFindingsRequest = {
    val __obj = js.Dynamic.literal(Findings = Findings)
  
    __obj.asInstanceOf[BatchImportFindingsRequest]
  }
}

