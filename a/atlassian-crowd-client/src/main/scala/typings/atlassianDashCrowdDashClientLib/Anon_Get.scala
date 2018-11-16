package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Get extends js.Object {
  var add: js.Function2[
    /* username */ java.lang.String, 
    /* groupname */ java.lang.String, 
    stdLib.Promise[scala.Unit]
  ]
  var get: js.Function3[
    /* username */ java.lang.String, 
    /* groupname */ java.lang.String, 
    /* nested */ js.UndefOr[scala.Boolean], 
    stdLib.Promise[java.lang.String]
  ]
  var list: js.Function4[
    /* username */ java.lang.String, 
    /* nested */ js.UndefOr[scala.Boolean], 
    /* startIndex */ js.UndefOr[scala.Double], 
    /* maxResults */ js.UndefOr[scala.Double], 
    stdLib.Promise[js.Array[java.lang.String]]
  ]
  var remove: js.Function2[
    /* username */ java.lang.String, 
    /* groupname */ java.lang.String, 
    stdLib.Promise[scala.Unit]
  ]
}

