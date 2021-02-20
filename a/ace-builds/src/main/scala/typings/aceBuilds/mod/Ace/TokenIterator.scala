package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenIterator extends StObject {
  
  def getCurrentToken(): Token = js.native
  
  def getCurrentTokenColumn(): Double = js.native
  
  def getCurrentTokenPosition(): Point = js.native
  
  def getCurrentTokenRange(): Range = js.native
  
  def getCurrentTokenRow(): Double = js.native
  
  def stepBackward(): Token = js.native
  
  def stepForward(): Token = js.native
}
object TokenIterator {
  
  @scala.inline
  def apply(
    getCurrentToken: () => Token,
    getCurrentTokenColumn: () => Double,
    getCurrentTokenPosition: () => Point,
    getCurrentTokenRange: () => Range,
    getCurrentTokenRow: () => Double,
    stepBackward: () => Token,
    stepForward: () => Token
  ): TokenIterator = {
    val __obj = js.Dynamic.literal(getCurrentToken = js.Any.fromFunction0(getCurrentToken), getCurrentTokenColumn = js.Any.fromFunction0(getCurrentTokenColumn), getCurrentTokenPosition = js.Any.fromFunction0(getCurrentTokenPosition), getCurrentTokenRange = js.Any.fromFunction0(getCurrentTokenRange), getCurrentTokenRow = js.Any.fromFunction0(getCurrentTokenRow), stepBackward = js.Any.fromFunction0(stepBackward), stepForward = js.Any.fromFunction0(stepForward))
    __obj.asInstanceOf[TokenIterator]
  }
  
  @scala.inline
  implicit class TokenIteratorMutableBuilder[Self <: TokenIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentToken(value: () => Token): Self = StObject.set(x, "getCurrentToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTokenColumn(value: () => Double): Self = StObject.set(x, "getCurrentTokenColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTokenPosition(value: () => Point): Self = StObject.set(x, "getCurrentTokenPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTokenRange(value: () => Range): Self = StObject.set(x, "getCurrentTokenRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTokenRow(value: () => Double): Self = StObject.set(x, "getCurrentTokenRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepBackward(value: () => Token): Self = StObject.set(x, "stepBackward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepForward(value: () => Token): Self = StObject.set(x, "stepForward", js.Any.fromFunction0(value))
  }
}
