package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Membership extends js.Object {
  var attributes: Anon_Set
  var children: Anon_Get
  var create: js.Function1[
    /* group */ atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced, 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced]
  ]
  var get: js.Function2[
    /* groupname */ java.lang.String, 
    /* withAttributes */ js.UndefOr[scala.Boolean], 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced]
  ]
  var membership: js.Function0[stdLib.Promise[java.lang.String]]
  var parents: Anon_GetGroupnameParentname
  var remove: js.Function1[/* groupname */ java.lang.String, stdLib.Promise[scala.Unit]]
  var update: js.Function2[
    /* groupname */ java.lang.String, 
    /* group */ atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced, 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced]
  ]
  var users: Anon_GetGroupname
}

