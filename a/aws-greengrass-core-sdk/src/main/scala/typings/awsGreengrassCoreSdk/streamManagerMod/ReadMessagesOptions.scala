package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.dataMod.ReadMessagesOptionsMap
import typings.awsGreengrassCoreSdk.dataMod.TypesMap
import typings.awsGreengrassCoreSdk.dataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "ReadMessagesOptions")
@js.native
open class ReadMessagesOptions protected ()
  extends typings.awsGreengrassCoreSdk.clientMod.ReadMessagesOptions {
  /**
    * @param desiredStartSequenceNumber The desired beginning sequence number to start reading from.
    * If the desired sequence number is less than the current minimum of the stream, then it will instead start reading from the current minimum.
    * @param minMessageCount The minimum number of messages that will be returned.
    * If not enough messages are available for reading, then NotEnoughMessages exception will be thrown.
    * The minimum values is 1 and the maximum value is 2147483647.
    * @param maxMessageCount The maximum number of messages that will be returned.
    * The minimum values is the value of the minimum message count and the maximum value is 2147483647.
    * @param readTimeoutMillis The time to wait for messages in milliseconds. Default is 0, meaning that the server will not wait for messages.
    * If it can fulfill the minimum messages it will return them, but otherwise NotEnoughMessages exception will be thrown.
    * If the timeout is greater than zero, then the server will wait up to that time for more messages to be appended to the stream,
    * waiting until the minimum number of messages is reached. The maximum value is the value of the client timeout.
    */
  def this(
    desiredStartSequenceNumber: js.UndefOr[Double | Null],
    minMessageCount: js.UndefOr[Double | Null],
    maxMessageCount: js.UndefOr[Double | Null],
    readTimeoutMillis: js.UndefOr[Double | Null]
  ) = this()
}
/* static members */
object ReadMessagesOptions {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ReadMessagesOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ReadMessagesOptions.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ReadMessagesOptionsMap): typings.awsGreengrassCoreSdk.dataMod.ReadMessagesOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.ReadMessagesOptions]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ReadMessagesOptions.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ReadMessagesOptions.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
