package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Group extends js.Object {
  var group: js.Function4[
    /* restriction */ java.lang.String, 
    /* expand */ js.UndefOr[scala.Boolean], 
    /* startIndex */ js.UndefOr[scala.Double], 
    /* maxResults */ js.UndefOr[scala.Double], 
    stdLib.Promise[
      js.Array[java.lang.String] | js.Array[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced]
    ]
  ]
  var user: js.Function4[
    /* restriction */ java.lang.String, 
    /* expand */ js.UndefOr[scala.Boolean], 
    /* startIndex */ js.UndefOr[scala.Double], 
    /* maxResults */ js.UndefOr[scala.Double], 
    stdLib.Promise[
      js.Array[java.lang.String] | js.Array[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced]
    ]
  ]
}

