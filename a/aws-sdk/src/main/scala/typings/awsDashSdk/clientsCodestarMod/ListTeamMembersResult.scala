package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTeamMembersResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A list of team member objects for the project.
    */
  var teamMembers: TeamMemberResult
}

object ListTeamMembersResult {
  @scala.inline
  def apply(teamMembers: TeamMemberResult, nextToken: PaginationToken = null): ListTeamMembersResult = {
    val __obj = js.Dynamic.literal(teamMembers = teamMembers)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTeamMembersResult]
  }
}

