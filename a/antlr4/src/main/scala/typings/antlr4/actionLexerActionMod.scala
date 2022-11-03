package typings.antlr4

import typings.antlr4.atnLexerActionTypeMod.LexerActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionLexerActionMod {
  
  /* note: abstract class */ @JSImport("antlr4/action/LexerAction", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LexerAction {
    def this(action: LexerActionType) = this()
    
    /* CompleteClass */
    override val actionType: LexerActionType = js.native
    
    /* CompleteClass */
    override def equals(other: LexerAction): Boolean = js.native
    
    /* CompleteClass */
    override val isPositionDependent: Boolean = js.native
    
    /* CompleteClass */
    override def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
  
  trait LexerAction extends StObject {
    
    val actionType: LexerActionType
    
    def equals(other: LexerAction): Boolean
    
    val isPositionDependent: Boolean
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit
  }
  object LexerAction {
    
    inline def apply(
      actionType: LexerActionType,
      equals_ : LexerAction => Boolean,
      isPositionDependent: Boolean,
      updateHashCode: typings.antlr4.miscHashCodeMod.default => Unit
    ): LexerAction = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], isPositionDependent = isPositionDependent.asInstanceOf[js.Any], updateHashCode = js.Any.fromFunction1(updateHashCode))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[LexerAction]
    }
    
    extension [Self <: LexerAction](x: Self) {
      
      inline def setActionType(value: LexerActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: LexerAction => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setIsPositionDependent(value: Boolean): Self = StObject.set(x, "isPositionDependent", value.asInstanceOf[js.Any])
      
      inline def setUpdateHashCode(value: typings.antlr4.miscHashCodeMod.default => Unit): Self = StObject.set(x, "updateHashCode", js.Any.fromFunction1(value))
    }
  }
}
