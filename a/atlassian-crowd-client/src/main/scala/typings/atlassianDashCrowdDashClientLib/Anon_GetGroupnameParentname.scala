package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_GetGroupnameParentname extends js.Object {
  var add: js.Function2[
    /* groupname */ java.lang.String, 
    /* parentname */ java.lang.String, 
    js.Promise[scala.Unit]
  ]
  var get: js.Function3[
    /* groupname */ java.lang.String, 
    /* parentname */ java.lang.String, 
    /* nested */ js.UndefOr[scala.Boolean], 
    js.Promise[java.lang.String]
  ]
  var list: js.Function4[
    /* groupname */ java.lang.String, 
    /* nested */ js.UndefOr[scala.Boolean], 
    /* startIndex */ js.UndefOr[scala.Double], 
    /* maxResults */ js.UndefOr[scala.Double], 
    js.Promise[js.Array[java.lang.String]]
  ]
}

