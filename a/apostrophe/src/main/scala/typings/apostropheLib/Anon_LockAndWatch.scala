package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_LockAndWatch extends js.Object {
  var getManager: js.Function1[/* type */ java.lang.String, scala.Unit]
  var lock: js.Function2[/* id */ java.lang.String, /* callback */ js.UndefOr[js.Function0[_]], scala.Unit]
  var lockAndWatch: js.Function2[/* id */ java.lang.String, /* callback */ js.UndefOr[js.Function0[_]], scala.Unit]
  var setManager: js.Function2[/* type */ java.lang.String, /* manager */ js.Any, scala.Unit]
  var unlock: js.Function3[
    /* _id */ java.lang.String, 
    /* sync */ js.Any, 
    /* callback */ js.UndefOr[js.Function0[_]], 
    _
  ]
}

