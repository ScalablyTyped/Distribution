package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundTokenizer extends StObject {
  
  /**
    * Emits the `'update'` event. `firstRow` and `lastRow` are used to define the boundaries of the region to be updated.
    * @param firstRow The starting row region
    * @param lastRow The final row region
    **/
  def fireUpdateEvent(firstRow: Double, lastRow: Double): Unit
  
  /**
    * [Returns the state of tokenization at the end of a row.]{: #BackgroundTokenizer.getState}
    * @param row The row to get state at
    **/
  def getState(row: Double): String
  
  /**
    * Gives list of tokens of the row. (tokens are cached)
    * @param row The row to get tokens at
    **/
  def getTokens(row: Double): js.Array[TokenInfo]
  
  /**
    * Sets a new document to associate with this object.
    * @param doc The new document to associate with
    **/
  def setDocument(doc: Document): Unit
  
  /**
    * Sets a new tokenizer for this object.
    * @param tokenizer The new tokenizer to use
    **/
  def setTokenizer(tokenizer: Tokenizer): Unit
  
  /**
    * Starts tokenizing at the row indicated.
    * @param startRow The row to start at
    **/
  def start(startRow: Double): Unit
  
  var states: js.Array[Any]
  
  /**
    * Stops tokenizing.
    **/
  def stop(): Unit
}
object BackgroundTokenizer {
  
  inline def apply(
    fireUpdateEvent: (Double, Double) => Unit,
    getState: Double => String,
    getTokens: Double => js.Array[TokenInfo],
    setDocument: Document => Unit,
    setTokenizer: Tokenizer => Unit,
    start: Double => Unit,
    states: js.Array[Any],
    stop: () => Unit
  ): BackgroundTokenizer = {
    val __obj = js.Dynamic.literal(fireUpdateEvent = js.Any.fromFunction2(fireUpdateEvent), getState = js.Any.fromFunction1(getState), getTokens = js.Any.fromFunction1(getTokens), setDocument = js.Any.fromFunction1(setDocument), setTokenizer = js.Any.fromFunction1(setTokenizer), start = js.Any.fromFunction1(start), states = states.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[BackgroundTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundTokenizer] (val x: Self) extends AnyVal {
    
    inline def setFireUpdateEvent(value: (Double, Double) => Unit): Self = StObject.set(x, "fireUpdateEvent", js.Any.fromFunction2(value))
    
    inline def setGetState(value: Double => String): Self = StObject.set(x, "getState", js.Any.fromFunction1(value))
    
    inline def setGetTokens(value: Double => js.Array[TokenInfo]): Self = StObject.set(x, "getTokens", js.Any.fromFunction1(value))
    
    inline def setSetDocument(value: Document => Unit): Self = StObject.set(x, "setDocument", js.Any.fromFunction1(value))
    
    inline def setSetTokenizer(value: Tokenizer => Unit): Self = StObject.set(x, "setTokenizer", js.Any.fromFunction1(value))
    
    inline def setStart(value: Double => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStates(value: js.Array[Any]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesVarargs(value: Any*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
