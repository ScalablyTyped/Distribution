package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Create extends js.Object {
  var attributes: Anon_Username
  var create: js.Function1[
    /* user */ atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced, 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced]
  ]
  var get: js.Function2[
    /* username */ java.lang.String, 
    /* withAttributes */ js.UndefOr[scala.Boolean], 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced]
  ]
  var groups: Anon_Get
  var remove: js.Function1[/* username */ java.lang.String, stdLib.Promise[scala.Unit]]
  var rename: js.Function2[
    /* oldname */ java.lang.String, 
    /* newname */ java.lang.String, 
    stdLib.Promise[scala.Unit]
  ]
  var update: js.Function2[
    /* username */ java.lang.String, 
    /* user */ atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced, 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced]
  ]
}

