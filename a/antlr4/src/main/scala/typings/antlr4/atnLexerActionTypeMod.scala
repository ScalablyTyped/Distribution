package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnLexerActionTypeMod {
  
  @JSImport("antlr4/atn/LexerActionType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LexerActionType & Double] = js.native
    
    /* 0 */ val CHANNEL: typings.antlr4.atnLexerActionTypeMod.LexerActionType.CHANNEL & Double = js.native
    
    /* 1 */ val CUSTOM: typings.antlr4.atnLexerActionTypeMod.LexerActionType.CUSTOM & Double = js.native
    
    /* 2 */ val MODE: typings.antlr4.atnLexerActionTypeMod.LexerActionType.MODE & Double = js.native
    
    /* 3 */ val MORE: typings.antlr4.atnLexerActionTypeMod.LexerActionType.MORE & Double = js.native
    
    /* 4 */ val POP_MODE: typings.antlr4.atnLexerActionTypeMod.LexerActionType.POP_MODE & Double = js.native
    
    /* 5 */ val PUSH_MODE: typings.antlr4.atnLexerActionTypeMod.LexerActionType.PUSH_MODE & Double = js.native
    
    /* 6 */ val SKIP: typings.antlr4.atnLexerActionTypeMod.LexerActionType.SKIP & Double = js.native
    
    /* 7 */ val TYPE: typings.antlr4.atnLexerActionTypeMod.LexerActionType.TYPE & Double = js.native
  }
  
  @js.native
  sealed trait LexerActionType extends StObject
  @JSImport("antlr4/atn/LexerActionType", "LexerActionType")
  @js.native
  object LexerActionType extends StObject {
    
    /**
      * The type of a {@link LexerChannelAction} action.
      */
    @js.native
    sealed trait CHANNEL
      extends StObject
         with LexerActionType
    
    /**
      * The type of a {@link LexerCustomAction} action
      */
    @js.native
    sealed trait CUSTOM
      extends StObject
         with LexerActionType
    
    /**
      * The type of a {@link LexerModeAction} action.
      */
    @js.native
    sealed trait MODE
      extends StObject
         with LexerActionType
    
    /**
      * The type of a {@link LexerMoreAction} action.
      */
    @js.native
    sealed trait MORE
      extends StObject
         with LexerActionType
    
    /**
      * The type of a {@link LexerPopModeAction} action.
      */
    @js.native
    sealed trait POP_MODE
      extends StObject
         with LexerActionType
    
    /**
      * The type of a {@link LexerPushModeAction} action.
      */
    @js.native
    sealed trait PUSH_MODE
      extends StObject
         with LexerActionType
    
    /**
      * The type of a {@link LexerSkipAction} action.
      */
    @js.native
    sealed trait SKIP
      extends StObject
         with LexerActionType
    
    /**
      * The type of a {@link LexerTypeAction} action.
      */
    @js.native
    sealed trait TYPE
      extends StObject
         with LexerActionType
  }
}
