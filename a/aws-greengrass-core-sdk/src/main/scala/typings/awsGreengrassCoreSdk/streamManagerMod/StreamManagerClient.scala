package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.streamManagerClientMod.StreamManagerClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "StreamManagerClient")
@js.native
/**
  * Constructs a new Stream Manager client. Once connected, <tt>onConnectCb</tt> will be called and
  * the client can then be used.
  *
  * @param opts All these options are optional.
  * @param opts.port
  * @param opts.host
  * @param opts.onConnectCb Optional callback to be called once the client has connected.
  * @param opts.onErrorCb Optional, but highly suggested callback to be called when a connection error occurs.
  * @param opts.logger
  */
open class StreamManagerClient ()
  extends typings.awsGreengrassCoreSdk.streamManagerClientMod.StreamManagerClient {
  def this(opts: StreamManagerClientOptions) = this()
}
