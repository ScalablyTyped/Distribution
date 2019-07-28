package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsOutput extends js.Object {
  /**
    * If set to true, there are more streams available to list.
    */
  var HasMoreStreams: BooleanObject
  /**
    * The names of the streams that are associated with the AWS account making the ListStreams request.
    */
  var StreamNames: StreamNameList
}

object ListStreamsOutput {
  @scala.inline
  def apply(HasMoreStreams: BooleanObject, StreamNames: StreamNameList): ListStreamsOutput = {
    val __obj = js.Dynamic.literal(HasMoreStreams = HasMoreStreams, StreamNames = StreamNames)
  
    __obj.asInstanceOf[ListStreamsOutput]
  }
}

