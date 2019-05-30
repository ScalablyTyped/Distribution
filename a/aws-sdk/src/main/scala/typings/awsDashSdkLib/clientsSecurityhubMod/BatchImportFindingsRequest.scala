package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchImportFindingsRequest extends js.Object {
  /**
    * A list of findings to import. You must submit them in the AwsSecurityFinding format.
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

