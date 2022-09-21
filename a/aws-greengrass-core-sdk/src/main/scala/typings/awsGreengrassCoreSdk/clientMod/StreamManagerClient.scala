package typings.awsGreengrassCoreSdk.clientMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "StreamManagerClient")
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
open class StreamManagerClient () extends StObject {
  def this(opts: StreamManagerClientOptions) = this()
  
  /**
    * Append a message into the specified message stream. Returns the sequence number of the message
    * if it was successfully appended.
    *
    * @param streamName The name of the stream to append to.
    * @param data Buffer containing the data to be written.
    * @returns
    */
  def appendMessage(streamName: String, data: Buffer): js.Promise[Double] = js.native
  
  /**
    * Close the connection
    */
  def close(): Unit = js.native
  
  /**
    * Create a message stream with a given definition.
    *
    * @param definition
    * @returns
    */
  def createMessageStream(definition: typings.awsGreengrassCoreSdk.dataMod.MessageStreamDefinition): js.Promise[Unit] = js.native
  
  /**
    * Deletes a message stream based on its name. Nothing is returned if the request succeeds.
    * An error will be thrown if the request fails.
    *
    * @param streamName The name of the stream to be deleted.
    * @returns
    */
  def deleteMessageStream(streamName: String): js.Promise[Unit] = js.native
  
  /**
    * Describe a message stream to get metadata including the stream's definition,
    * size, and exporter statuses.
    *
    * @param streamName The name of the stream to describe
    * @returns
    */
  def describeMessageStream(streamName: String): js.Promise[typings.awsGreengrassCoreSdk.dataMod.MessageStreamInfo] = js.native
  
  /**
    * List the streams in StreamManager. Returns a list of their names.
    *
    * @returns
    */
  def listStreams(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Add a callback for when the client connects.
    * @param f
    */
  def onConnected(f: js.Function0[Any]): Unit = js.native
  
  /**
    * Add a callback for when an error occurs.
    * @param f
    */
  def onError(f: js.Function1[/* e */ js.Error, Any]): Unit = js.native
  
  /**
    * Read message(s) from a chosen stream with options. If no options are specified it will try to read
    * 1 message from the stream.
    *
    * @param streamName The name of the stream to read from.
    * @param options.
    *     Defaults are:
    * <ul>
    *     <li>desiredStartSequenceNumber: 0</li>
    *     <li>minMessageCount: 1</li>
    *     <li>maxMessageCount: 1</li>
    *     <li>readTimeoutMillis: 0 <pre>// Where 0 here represents that the server will immediately return the messages
    * // or an exception if there were not enough messages available.</pre></li>
    * </ul>
    * <p>
    *     If desiredStartSequenceNumber is specified in the options and is less
    *     than the current beginning of the stream, returned messages will start
    *     at the beginning of the stream and not necessarily the desiredStartSequenceNumber.
    * </p>
    * @returns  List of one or more messages.
    */
  def readMessages(streamName: String): js.Promise[js.Array[typings.awsGreengrassCoreSdk.dataMod.Message]] = js.native
  def readMessages(streamName: String, options: typings.awsGreengrassCoreSdk.dataMod.ReadMessagesOptions): js.Promise[js.Array[typings.awsGreengrassCoreSdk.dataMod.Message]] = js.native
  
  /**
    * Updates a message stream with the new definition.
    * Minimum version requirements: StreamManager server version 1.1 (or AWS IoT Greengrass Core 1.11.0)
    *
    * @param definition
    * @returns
    */
  def updateMessageStream(definition: typings.awsGreengrassCoreSdk.dataMod.MessageStreamDefinition): js.Promise[Unit] = js.native
}
