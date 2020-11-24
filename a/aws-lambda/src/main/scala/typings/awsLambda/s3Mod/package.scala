package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3Mod {
  
  type S3CreateEvent = typings.awsLambda.s3Mod.S3Event
  
  type S3Handler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.s3Mod.S3Event, scala.Unit]
}
