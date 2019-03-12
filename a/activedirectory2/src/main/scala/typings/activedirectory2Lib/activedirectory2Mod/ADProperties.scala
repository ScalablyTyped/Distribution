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

object ADProperties {
  @scala.inline
  def apply(
    baseDN: java.lang.String,
    password: java.lang.String,
    url: java.lang.String,
    username: java.lang.String,
    attributes: activedirectory2Lib.Anon_Cn = null,
    entryParser: (/* entry */ js.Object, /* raw */ java.lang.String, /* cb */ js.Function1[/* entry */ js.Object, scala.Unit]) => scala.Unit = null,
    pageSize: activedirectory2Lib.activedirectory2LibNumbers.`1000` = null,
    referrals: activedirectory2Lib.Anon_Enabled = null
  ): ADProperties = {
    val __obj = js.Dynamic.literal(baseDN = baseDN, password = password, url = url, username = username)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (entryParser != null) __obj.updateDynamic("entryParser")(js.Any.fromFunction3(entryParser))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (referrals != null) __obj.updateDynamic("referrals")(referrals)
    __obj.asInstanceOf[ADProperties]
  }
}

