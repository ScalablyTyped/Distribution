package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Username extends js.Object {
  var list: js.Function1[
    /* username */ java.lang.String, 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  ]
  var password: Anon_SetUsername
  var remove: js.Function2[
    /* username */ java.lang.String, 
    /* attributename */ java.lang.String, 
    stdLib.Promise[scala.Unit]
  ]
  var set: js.Function2[
    /* username */ java.lang.String, 
    /* attributes */ atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced, 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  ]
  var username: Anon_Request
}

