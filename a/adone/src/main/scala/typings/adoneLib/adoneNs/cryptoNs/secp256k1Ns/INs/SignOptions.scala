package typings
package adoneLib.adoneNs.cryptoNs.secp256k1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var data: js.UndefOr[nodeLib.Buffer | scala.Null] = js.undefined
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ nodeLib.Buffer, 
      /* privateKey */ nodeLib.Buffer, 
      /* algo */ nodeLib.Buffer, 
      /* data */ nodeLib.Buffer, 
      /* attempt */ scala.Double, 
      nodeLib.Buffer
    ]
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    data: nodeLib.Buffer = null,
    noncefn: (/* message */ nodeLib.Buffer, /* privateKey */ nodeLib.Buffer, /* algo */ nodeLib.Buffer, /* data */ nodeLib.Buffer, /* attempt */ scala.Double) => nodeLib.Buffer = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (noncefn != null) __obj.updateDynamic("noncefn")(js.Any.fromFunction5(noncefn))
    __obj.asInstanceOf[SignOptions]
  }
}

