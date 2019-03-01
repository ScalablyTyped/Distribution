package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockCallback extends js.Object {
  var Block: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* parent */ adoneLib.adoneNs.shaniNs.INs.Block, 
    /* options */ adoneLib.adoneNs.shaniNs.INs.DescribeOptions, 
    adoneLib.adoneNs.shaniNs.INs.Block
  ]
  var Hook: org.scalablytyped.runtime.Instantiable3[
    /* description */ java.lang.String, 
    /* callback */ adoneLib.adoneNs.shaniNs.INs.HookCallback, 
    /* runtimeContext */ js.Object, 
    adoneLib.adoneNs.shaniNs.INs.Hook
  ]
  var Test: org.scalablytyped.runtime.Instantiable5[
    /* description */ java.lang.String, 
    /* callback */ adoneLib.adoneNs.shaniNs.INs.TestCallback, 
    /* block */ adoneLib.adoneNs.shaniNs.INs.Block, 
    /* runtimeContext */ js.Object, 
    /* options */ adoneLib.adoneNs.shaniNs.INs.TestOptions, 
    adoneLib.adoneNs.shaniNs.INs.Test
  ]
}

object Anon_BlockCallback {
  @scala.inline
  def apply(
    Block: org.scalablytyped.runtime.Instantiable3[
      /* name */ java.lang.String, 
      /* parent */ adoneLib.adoneNs.shaniNs.INs.Block, 
      /* options */ adoneLib.adoneNs.shaniNs.INs.DescribeOptions, 
      adoneLib.adoneNs.shaniNs.INs.Block
    ],
    Hook: org.scalablytyped.runtime.Instantiable3[
      /* description */ java.lang.String, 
      /* callback */ adoneLib.adoneNs.shaniNs.INs.HookCallback, 
      /* runtimeContext */ js.Object, 
      adoneLib.adoneNs.shaniNs.INs.Hook
    ],
    Test: org.scalablytyped.runtime.Instantiable5[
      /* description */ java.lang.String, 
      /* callback */ adoneLib.adoneNs.shaniNs.INs.TestCallback, 
      /* block */ adoneLib.adoneNs.shaniNs.INs.Block, 
      /* runtimeContext */ js.Object, 
      /* options */ adoneLib.adoneNs.shaniNs.INs.TestOptions, 
      adoneLib.adoneNs.shaniNs.INs.Test
    ]
  ): Anon_BlockCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Block")(Block)
    __obj.updateDynamic("Hook")(Hook)
    __obj.updateDynamic("Test")(Test)
    __obj.asInstanceOf[Anon_BlockCallback]
  }
}

