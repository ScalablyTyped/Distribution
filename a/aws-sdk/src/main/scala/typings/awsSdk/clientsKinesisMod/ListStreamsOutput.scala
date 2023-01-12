package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsOutput extends StObject {
  
  /**
    * If set to true, there are more streams available to list.
    */
  var HasMoreStreams: BooleanObject
  
  /**
    * The names of the streams that are associated with the Amazon Web Services account making the ListStreams request.
    */
  var StreamNames: StreamNameList
}
object ListStreamsOutput {
  
  inline def apply(HasMoreStreams: BooleanObject, StreamNames: StreamNameList): ListStreamsOutput = {
    val __obj = js.Dynamic.literal(HasMoreStreams = HasMoreStreams.asInstanceOf[js.Any], StreamNames = StreamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
    
    inline def setHasMoreStreams(value: BooleanObject): Self = StObject.set(x, "HasMoreStreams", value.asInstanceOf[js.Any])
    
    inline def setStreamNames(value: StreamNameList): Self = StObject.set(x, "StreamNames", value.asInstanceOf[js.Any])
    
    inline def setStreamNamesVarargs(value: StreamName*): Self = StObject.set(x, "StreamNames", js.Array(value*))
  }
}
