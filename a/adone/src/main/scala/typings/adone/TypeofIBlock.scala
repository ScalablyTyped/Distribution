package typings.adone

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable5
import typings.adone.adoneNs.shaniNs.INs.Block
import typings.adone.adoneNs.shaniNs.INs.DescribeOptions
import typings.adone.adoneNs.shaniNs.INs.Hook
import typings.adone.adoneNs.shaniNs.INs.HookCallback
import typings.adone.adoneNs.shaniNs.INs.Test
import typings.adone.adoneNs.shaniNs.INs.TestCallback
import typings.adone.adoneNs.shaniNs.INs.TestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofIBlock extends js.Object {
  var Block: Instantiable3[
    /* name */ String, 
    /* parent */ typings.adone.adoneNs.shaniNs.INs.Block, 
    /* options */ DescribeOptions, 
    typings.adone.adoneNs.shaniNs.INs.Block
  ]
  var Hook: Instantiable3[
    /* description */ String, 
    /* callback */ HookCallback, 
    /* runtimeContext */ js.Object, 
    typings.adone.adoneNs.shaniNs.INs.Hook
  ]
  var Test: Instantiable5[
    /* description */ String, 
    /* callback */ TestCallback, 
    /* block */ Block, 
    /* runtimeContext */ js.Object, 
    /* options */ TestOptions, 
    typings.adone.adoneNs.shaniNs.INs.Test
  ]
}

object TypeofIBlock {
  @scala.inline
  def apply(
    Block: Instantiable3[/* name */ String, /* parent */ Block, /* options */ DescribeOptions, Block],
    Hook: Instantiable3[
      /* description */ String, 
      /* callback */ HookCallback, 
      /* runtimeContext */ js.Object, 
      Hook
    ],
    Test: Instantiable5[
      /* description */ String, 
      /* callback */ TestCallback, 
      /* block */ Block, 
      /* runtimeContext */ js.Object, 
      /* options */ TestOptions, 
      Test
    ]
  ): TypeofIBlock = {
    val __obj = js.Dynamic.literal(Block = Block, Hook = Hook, Test = Test)
  
    __obj.asInstanceOf[TypeofIBlock]
  }
}

