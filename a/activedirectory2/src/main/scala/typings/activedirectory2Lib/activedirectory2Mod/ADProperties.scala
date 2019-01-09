package typings
package activedirectory2Lib.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADProperties extends js.Object {
  var attributes: js.UndefOr[activedirectory2Lib.Anon_Cn] = js.undefined
  var baseDN: java.lang.String
  var entryParser: js.UndefOr[
    js.Function3[
      /* entry */ js.Object, 
      /* raw */ java.lang.String, 
      /* cb */ js.Function1[/* entry */ js.Object, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var pageSize: js.UndefOr[activedirectory2Lib.activedirectory2LibNumbers.`1000`] = js.undefined
  var password: java.lang.String
  var referrals: js.UndefOr[activedirectory2Lib.Anon_Enabled] = js.undefined
  var url: java.lang.String
  var username: java.lang.String
}

