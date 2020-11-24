package typings.awsKcl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function0[scala.Unit]
  
  type CheckpointCallback = js.Function2[
    /* error */ js.UndefOr[java.lang.String], 
    /* checkpointedSequenceNumber */ java.lang.String, 
    scala.Unit
  ]
  
  // tslint:disable-line:no-empty-interface
  type ShardEndedInput = typings.awsKcl.mod.CheckpointInput
}
