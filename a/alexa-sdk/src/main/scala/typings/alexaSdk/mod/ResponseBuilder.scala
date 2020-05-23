package typings.alexaSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.alexaSdk.anon.Subtitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", "ResponseBuilder")
@js.native
class ResponseBuilder protected () extends js.Object {
  def this(alexaHandler: Handler_[Request]) = this()
  /**
    * Render a askForPermissionsConsent card
    * @param permissions permissions
    * @returns ResponseBuilder
    */
  def askForPermissionsConsentCard(permissions: js.Array[StringDictionary[String]]): ResponseBuilder = js.native
  /**
    * Creates a play, stop or clearQueue audioPlayer directive depending on the directive type passed in.
    * @deprecated - use audioPlayerPlay, audioPlayerStop, audioPlayerClearQueue instead
    * @param directiveType directiveType
    * @param behavior behavior
    * @param url url
    * @param token token
    * @param expectedPreviousToken expectedPreviousToken
    * @param offsetInMilliseconds offsetInMilliseconds
    * @returns ResponseBuilder
    */
  def audioPlayer(
    directiveType: String,
    behavior: String,
    url: String,
    token: String,
    expectedPreviousToken: String,
    offsetInMilliseconds: Double
  ): ResponseBuilder = js.native
  /**
    * Creates an AudioPlayer ClearQueue directive - clear the queue without stopping the currently playing stream,
    * or clear the queue and stop any currently playing stream.
    * @param clearBehavior Describes the clear queue behavior. Accepted values:
    * CLEAR_ENQUEUED: clears the queue and continues to play the currently playing stream
    * CLEAR_ALL: clears the entire playback queue and stops the currently playing stream (if applicable).
    * @returns ResponseBuilder
    */
  def audioPlayerClearQueue(clearBehavior: String): ResponseBuilder = js.native
  /**
    * Creates an AudioPlayer play directive
    * @param behavior Describes playback behavior. Accepted values:
    * REPLACE_ALL: Immediately begin playback of the specified stream, and replace current and enqueued streams.
    * ENQUEUE: Add the specified stream to the end of the current queue. This does not impact the currently playing stream.
    * REPLACE_ENQUEUED: Replace all streams in the queue. This does not impact the currently playing stream.
    * @param url Identifies the location of audio content at a remote HTTPS location.
    * The audio file must be hosted at an Internet-accessible HTTPS endpoint. HTTPS is required, and the domain hosting the
    * files must present a valid, trusted SSL certificate. Self-signed certificates cannot be used.
    * The supported formats for the audio file include AAC/MP4, MP3, HLS, PLS and M3U. Bitrates: 16kbps to 384 kbps.
    * @param token A token that represents the audio stream. This token cannot exceed 1024 characters
    * @param expectedPreviousToken A token that represents the expected previous stream.
    * This property is required and allowed only when the playBehavior is ENQUEUE. This is used to prevent potential race conditions
    * if requests to progress through a playlist and change tracks occur at the same time.
    * @param offsetInMilliseconds The timestamp in the stream from which Alexa should begin playback.
    * Set to 0 to start playing the stream from the beginning. Set to any other value to start playback from that associated point in the stream
    * @returns ResponseBuilder
    */
  def audioPlayerPlay(
    behavior: String,
    url: String,
    token: String,
    expectedPreviousToken: String,
    offsetInMilliseconds: Double
  ): ResponseBuilder = js.native
  /**
    * Creates an AudioPlayer Stop directive - Stops the current audio Playback
    * @returns ResponseBuilder
    */
  def audioPlayerStop(): ResponseBuilder = js.native
  /**
    * Render a card with the following title, content and image
    * @param cardTitle cardTitle
    * @param cardContent cardContent
    * @param cardImage cardImage
    * @returns ResponseBuilder
    */
  def cardRenderer(cardTitle: String, cardContent: String, cardImage: CardImage): ResponseBuilder = js.native
  /**
    * Creates a hint directive - show a hint on the screen of the echo show
    * @param hintText text to show on the hint
    * @param hintType (optional) Default value : PlainText
    * @returns ResponseBuilder
    */
  def hint(hintText: String): ResponseBuilder = js.native
  def hint(hintText: String, hintType: HintType): ResponseBuilder = js.native
  /**
    * Render a link account card
    * @returns ResponseBuilder
    */
  def linkAccountCard(): ResponseBuilder = js.native
  /**
    * Have alexa listen for speech from the user. If the user doesn't respond within 8 seconds
    * then have alexa reprompt with the provided reprompt speech
    * @param repromptSpeech repromptSpeech
    * @returns ResponseBuilder
    */
  def listen(repromptSpeech: String): ResponseBuilder = js.native
  /**
    * Creates a VideoApp play directive to play a video
    * @param source Identifies the location of video content at a remote HTTPS location.
    * The video file must be hosted at an Internet-accessible HTTPS endpoint.
    * @param metadata (optional) Contains an object that provides the
    * information that can be displayed on VideoApp.
    * @returns ResponseBuilder
    */
  def playVideo(source: String): ResponseBuilder = js.native
  def playVideo(source: String, metadata: Subtitle): ResponseBuilder = js.native
  /**
    * Creates a Display RenderTemplate Directive
    * Use a template builder to generate a template object
    * @param template template
    * @returns ResponseBuilder
    */
  def renderTemplate(template: Template): ResponseBuilder = js.native
  /**
    * Have Alexa say the provided speechOutput to the user
    * @param speechOutput speechOutput
    * @returns ResponseBuilder
    */
  def speak(speechOutput: String): ResponseBuilder = js.native
}

