package typings.awsSdk.clientsLexruntimev2Mod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexRuntimeV2 extends Service {
  
  @JSName("config")
  var config_LexRuntimeV2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Removes session information for a specified bot, alias, and user ID.  You can use this operation to restart a conversation with a bot. When you remove a session, the entire history of the session is removed so that you can start again. You don't need to delete a session. Sessions have a time limit and will expire. Set the session time limit when you create the bot. The default is 5 minutes, but you can specify anything between 1 minute and 24 hours. If you specify a bot or alias ID that doesn't exist, you receive a BadRequestException.  If the locale doesn't exist in the bot, or if the locale hasn't been enables for the alias, you receive a BadRequestException.
    */
  def deleteSession(): Request[DeleteSessionResponse, AWSError] = js.native
  def deleteSession(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSessionResponse, Unit]): Request[DeleteSessionResponse, AWSError] = js.native
  /**
    * Removes session information for a specified bot, alias, and user ID.  You can use this operation to restart a conversation with a bot. When you remove a session, the entire history of the session is removed so that you can start again. You don't need to delete a session. Sessions have a time limit and will expire. Set the session time limit when you create the bot. The default is 5 minutes, but you can specify anything between 1 minute and 24 hours. If you specify a bot or alias ID that doesn't exist, you receive a BadRequestException.  If the locale doesn't exist in the bot, or if the locale hasn't been enables for the alias, you receive a BadRequestException.
    */
  def deleteSession(params: DeleteSessionRequest): Request[DeleteSessionResponse, AWSError] = js.native
  def deleteSession(
    params: DeleteSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSessionResponse, Unit]
  ): Request[DeleteSessionResponse, AWSError] = js.native
  
  /**
    * Returns session information for a specified bot, alias, and user. For example, you can use this operation to retrieve session information for a user that has left a long-running session in use. If the bot, alias, or session identifier doesn't exist, Amazon Lex V2 returns a BadRequestException. If the locale doesn't exist or is not enabled for the alias, you receive a BadRequestException.
    */
  def getSession(): Request[GetSessionResponse, AWSError] = js.native
  def getSession(callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]): Request[GetSessionResponse, AWSError] = js.native
  /**
    * Returns session information for a specified bot, alias, and user. For example, you can use this operation to retrieve session information for a user that has left a long-running session in use. If the bot, alias, or session identifier doesn't exist, Amazon Lex V2 returns a BadRequestException. If the locale doesn't exist or is not enabled for the alias, you receive a BadRequestException.
    */
  def getSession(params: GetSessionRequest): Request[GetSessionResponse, AWSError] = js.native
  def getSession(
    params: GetSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]
  ): Request[GetSessionResponse, AWSError] = js.native
  
  /**
    * Creates a new session or modifies an existing session with an Amazon Lex V2 bot. Use this operation to enable your application to set the state of the bot.
    */
  def putSession(): Request[PutSessionResponse, AWSError] = js.native
  def putSession(callback: js.Function2[/* err */ AWSError, /* data */ PutSessionResponse, Unit]): Request[PutSessionResponse, AWSError] = js.native
  /**
    * Creates a new session or modifies an existing session with an Amazon Lex V2 bot. Use this operation to enable your application to set the state of the bot.
    */
  def putSession(params: PutSessionRequest): Request[PutSessionResponse, AWSError] = js.native
  def putSession(
    params: PutSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSessionResponse, Unit]
  ): Request[PutSessionResponse, AWSError] = js.native
  
  /**
    * Sends user input to Amazon Lex V2. Client applications use this API to send requests to Amazon Lex V2 at runtime. Amazon Lex V2 then interprets the user input using the machine learning model that it build for the bot. In response, Amazon Lex V2 returns the next message to convey to the user and an optional response card to display. If the optional post-fulfillment response is specified, the messages are returned as follows. For more information, see PostFulfillmentStatusSpecification.    Success message - Returned if the Lambda function completes successfully and the intent state is fulfilled or ready fulfillment if the message is present.    Failed message - The failed message is returned if the Lambda function throws an exception or if the Lambda function returns a failed intent state without a message.    Timeout message - If you don't configure a timeout message and a timeout, and the Lambda function doesn't return within 30 seconds, the timeout message is returned. If you configure a timeout, the timeout message is returned when the period times out.    For more information, see Completion message.
    */
  def recognizeText(): Request[RecognizeTextResponse, AWSError] = js.native
  def recognizeText(callback: js.Function2[/* err */ AWSError, /* data */ RecognizeTextResponse, Unit]): Request[RecognizeTextResponse, AWSError] = js.native
  /**
    * Sends user input to Amazon Lex V2. Client applications use this API to send requests to Amazon Lex V2 at runtime. Amazon Lex V2 then interprets the user input using the machine learning model that it build for the bot. In response, Amazon Lex V2 returns the next message to convey to the user and an optional response card to display. If the optional post-fulfillment response is specified, the messages are returned as follows. For more information, see PostFulfillmentStatusSpecification.    Success message - Returned if the Lambda function completes successfully and the intent state is fulfilled or ready fulfillment if the message is present.    Failed message - The failed message is returned if the Lambda function throws an exception or if the Lambda function returns a failed intent state without a message.    Timeout message - If you don't configure a timeout message and a timeout, and the Lambda function doesn't return within 30 seconds, the timeout message is returned. If you configure a timeout, the timeout message is returned when the period times out.    For more information, see Completion message.
    */
  def recognizeText(params: RecognizeTextRequest): Request[RecognizeTextResponse, AWSError] = js.native
  def recognizeText(
    params: RecognizeTextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RecognizeTextResponse, Unit]
  ): Request[RecognizeTextResponse, AWSError] = js.native
  
  /**
    * Sends user input to Amazon Lex V2. You can send text or speech. Clients use this API to send text and audio requests to Amazon Lex V2 at runtime. Amazon Lex V2 interprets the user input using the machine learning model built for the bot. The following request fields must be compressed with gzip and then base64 encoded before you send them to Amazon Lex V2.    requestAttributes   sessionState   The following response fields are compressed using gzip and then base64 encoded by Amazon Lex V2. Before you can use these fields, you must decode and decompress them.    inputTranscript   interpretations   messages   requestAttributes   sessionState   The example contains a Java application that compresses and encodes a Java object to send to Amazon Lex V2, and a second that decodes and decompresses a response from Amazon Lex V2. If the optional post-fulfillment response is specified, the messages are returned as follows. For more information, see PostFulfillmentStatusSpecification.    Success message - Returned if the Lambda function completes successfully and the intent state is fulfilled or ready fulfillment if the message is present.    Failed message - The failed message is returned if the Lambda function throws an exception or if the Lambda function returns a failed intent state without a message.    Timeout message - If you don't configure a timeout message and a timeout, and the Lambda function doesn't return within 30 seconds, the timeout message is returned. If you configure a timeout, the timeout message is returned when the period times out.    For more information, see Completion message.
    */
  def recognizeUtterance(): Request[RecognizeUtteranceResponse, AWSError] = js.native
  def recognizeUtterance(callback: js.Function2[/* err */ AWSError, /* data */ RecognizeUtteranceResponse, Unit]): Request[RecognizeUtteranceResponse, AWSError] = js.native
  /**
    * Sends user input to Amazon Lex V2. You can send text or speech. Clients use this API to send text and audio requests to Amazon Lex V2 at runtime. Amazon Lex V2 interprets the user input using the machine learning model built for the bot. The following request fields must be compressed with gzip and then base64 encoded before you send them to Amazon Lex V2.    requestAttributes   sessionState   The following response fields are compressed using gzip and then base64 encoded by Amazon Lex V2. Before you can use these fields, you must decode and decompress them.    inputTranscript   interpretations   messages   requestAttributes   sessionState   The example contains a Java application that compresses and encodes a Java object to send to Amazon Lex V2, and a second that decodes and decompresses a response from Amazon Lex V2. If the optional post-fulfillment response is specified, the messages are returned as follows. For more information, see PostFulfillmentStatusSpecification.    Success message - Returned if the Lambda function completes successfully and the intent state is fulfilled or ready fulfillment if the message is present.    Failed message - The failed message is returned if the Lambda function throws an exception or if the Lambda function returns a failed intent state without a message.    Timeout message - If you don't configure a timeout message and a timeout, and the Lambda function doesn't return within 30 seconds, the timeout message is returned. If you configure a timeout, the timeout message is returned when the period times out.    For more information, see Completion message.
    */
  def recognizeUtterance(params: RecognizeUtteranceRequest): Request[RecognizeUtteranceResponse, AWSError] = js.native
  def recognizeUtterance(
    params: RecognizeUtteranceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RecognizeUtteranceResponse, Unit]
  ): Request[RecognizeUtteranceResponse, AWSError] = js.native
}
