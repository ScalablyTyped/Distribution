package typings.awsDashSdk

import org.scalablytyped.runtime.Instantiable1
import typings.awsDashSdk.libPollyPresignerMod.Presigner.PresignerOptions
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/polly", JSImport.Namespace)
@js.native
object libServicesPollyMod extends js.Object {
  @js.native
  class PollyCustomizations () extends Service
  
  /* static members */
  @js.native
  object PollyCustomizations extends js.Object {
    var Presigner: Instantiable1[
        js.UndefOr[/* options */ PresignerOptions], 
        typings.awsDashSdk.libPollyPresignerMod.Presigner
      ] = js.native
  }
  
}

