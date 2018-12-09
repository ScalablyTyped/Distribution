package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Set extends js.Object {
  var list: js.Function1[
    /* groupname */ java.lang.String, 
    js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  ]
  var remove: js.Function2[
    /* groupname */ java.lang.String, 
    /* attributename */ java.lang.String, 
    js.Promise[scala.Unit]
  ]
  var set: js.Function2[
    /* groupname */ java.lang.String, 
    /* attributes */ atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced, 
    js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  ]
}

