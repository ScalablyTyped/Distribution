package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polly
  extends awsDashSdkLib.libServicesPollyMod.PollyCustomizations {
  @JSName("config")
  var config_Polly: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
    */
  def deleteLexicon(): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLexicon(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLexiconOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
    */
  def deleteLexicon(params: DeleteLexiconInput): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLexicon(
    params: DeleteLexiconInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLexiconOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
    */
  def describeVoices(): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeVoices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeVoicesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
    */
  def describeVoices(params: DescribeVoicesInput): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeVoices(
    params: DescribeVoicesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeVoicesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def getLexicon(): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLexicon(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLexiconOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def getLexicon(params: GetLexiconInput): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLexicon(
    params: GetLexiconInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLexiconOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
    */
  def getSpeechSynthesisTask(): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSpeechSynthesisTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSpeechSynthesisTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
    */
  def getSpeechSynthesisTask(params: GetSpeechSynthesisTaskInput): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSpeechSynthesisTask(
    params: GetSpeechSynthesisTaskInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSpeechSynthesisTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def listLexicons(): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLexicons(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLexiconsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
    */
  def listLexicons(params: ListLexiconsInput): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLexicons(
    params: ListLexiconsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLexiconsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
    */
  def listSpeechSynthesisTasks(): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSpeechSynthesisTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSpeechSynthesisTasksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
    */
  def listSpeechSynthesisTasks(params: ListSpeechSynthesisTasksInput): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSpeechSynthesisTasks(
    params: ListSpeechSynthesisTasksInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSpeechSynthesisTasksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
    */
  def putLexicon(): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLexicon(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLexiconOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
    */
  def putLexicon(params: PutLexiconInput): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLexicon(
    params: PutLexiconInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLexiconOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
    */
  def startSpeechSynthesisTask(): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSpeechSynthesisTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSpeechSynthesisTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
    */
  def startSpeechSynthesisTask(params: StartSpeechSynthesisTaskInput): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSpeechSynthesisTask(
    params: StartSpeechSynthesisTaskInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSpeechSynthesisTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
    */
  def synthesizeSpeech(): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def synthesizeSpeech(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SynthesizeSpeechOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
    */
  def synthesizeSpeech(params: SynthesizeSpeechInput): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def synthesizeSpeech(
    params: SynthesizeSpeechInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SynthesizeSpeechOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

