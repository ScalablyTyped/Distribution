package typings.adone.adoneNs.cryptoNs.secp256k1Ns.INs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var data: js.UndefOr[Buffer | Null] = js.undefined
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ Buffer, 
      /* privateKey */ Buffer, 
      /* algo */ Buffer, 
      /* data */ Buffer, 
      /* attempt */ Double, 
      Buffer
    ]
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    data: Buffer = null,
    noncefn: (/* message */ Buffer, /* privateKey */ Buffer, /* algo */ Buffer, /* data */ Buffer, /* attempt */ Double) => Buffer = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (noncefn != null) __obj.updateDynamic("noncefn")(js.Any.fromFunction5(noncefn))
    __obj.asInstanceOf[SignOptions]
  }
}

