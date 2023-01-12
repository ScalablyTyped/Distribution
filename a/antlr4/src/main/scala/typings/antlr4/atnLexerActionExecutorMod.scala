package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnLexerActionExecutorMod {
  
  @JSImport("antlr4/atn/LexerActionExecutor", JSImport.Default)
  @js.native
  /**
    * Represents an executor for a sequence of lexer actions which traversed during
    * the matching operation of a lexer rule (token).
    *
    * The executor tracks position information for position-dependent lexer actions
    * efficiently, ensuring that actions appearing only at the end of the rule do
    * not cause bloating of the {@link DFA} created for the lexer.
    */
  open class default ()
    extends StObject
       with LexerActionExecutor {
    def this(lexerActions: js.Array[typings.antlr4.actionLexerActionMod.default]) = this()
    
    /**
      * Caches the result of {@link hashCode} since the hash code is an element
      * of the performance-critical {@link LexerATNConfig.hashCode} operation
      */
    /* CompleteClass */
    override val cachedHashCode: Double = js.native
    
    /* CompleteClass */
    override def equals(other: LexerActionExecutor): Boolean = js.native
    
    /**
      * Execute the actions encapsulated by this executor within the context of a
      * particular {@link Lexer}.
      *
      * This method calls {@link IntStream//seek} to set the position of the
      * {@code input} {@link CharStream} prior to calling {@link LexerAction.execute}
      * on a position-dependent action. Before the method returns, the input position
      * will be restored to the same position it was in when the method was invoked.
      *
      * @param lexer The lexer instance.
      * @param input The input stream which is the source for the current token.
      * When this method is called, the current {@link IntStream.index} for
      * `input` should be the start of the following token, i.e. 1 character past
      * the end of the current token.
      * @param startIndex The token start index. This value may be passed to
      * {@link IntStream.seek} to set the `input` position to the beginning
      * of the token.
      */
    /* CompleteClass */
    override def execute(
      lexer: typings.antlr4.lexerMod.default,
      input: typings.antlr4.inputStreamMod.default,
      startIndex: Double
    ): Unit = js.native
    
    /**
      * Creates a {@link LexerActionExecutor} which encodes the current offset
      * for position-dependent lexer actions.
      *
      * Normally, when the executor encounters lexer actions where
      * {@link LexerAction.isPositionDependent} returns `true`, it calls
      * {@link IntStream.seek} on the input {@link CharStream} to set the input
      * position to the _end_ of the current token. This behavior provides
      * for efficient DFA representation of lexer actions which appear at the end
      * of a lexer rule, even when the lexer rule matches a variable number of
      * characters.
      *
      * Prior to traversing a match transition in the ATN, the current offset
      * from the token start index is assigned to all position-dependent lexer
      * actions which have not already been assigned a fixed offset. By storing
      * the offsets relative to the token start index, the DFA representation of
      * lexer actions which appear in the middle of tokens remains efficient due
      * to sharing among tokens of the same length, regardless of their absolute
      * position in the input stream.
      *
      * If the current executor already has offsets assigned to all
      * position-dependent lexer actions, the method returns `this`.
      *
      * @param offset The current offset to assign to all position-dependent
      * lexer actions which do not already have offsets assigned.
      *
      * @return A {@link LexerActionExecutor} which stores input stream offsets
      * for all position-dependent lexer actions.
      */
    /* CompleteClass */
    override def fixOffsetBeforeMatch(offset: Double): LexerActionExecutor = js.native
    
    /* CompleteClass */
    override val lexerActions: js.Array[typings.antlr4.actionLexerActionMod.default] = js.native
    
    /* CompleteClass */
    override def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/atn/LexerActionExecutor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a {@link LexerActionExecutor} which executes the actions for
      * the input `lexerActionExecutor` followed by a specified `lexerAction`.
      *
      * @param lexerActionExecutor The executor for actions already traversed by
      * the lexer while matching a token within a particular {@link LexerATNConfig}.
      * If this is `null`, the method behaves as though it were an empty executor.
      * @param lexerAction The lexer action to execute after the actions
      * specified in `lexerActionExecutor`.
      *
      * @return A {@link LexerActionExecutor} for executing the combine actions
      * of `lexerActionExecutor` and `lexerAction`.
      */
    inline def append(lexerActionExecutor: LexerActionExecutor, lexerAction: typings.antlr4.actionLexerActionMod.default): LexerActionExecutor = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(lexerActionExecutor.asInstanceOf[js.Any], lexerAction.asInstanceOf[js.Any])).asInstanceOf[LexerActionExecutor]
  }
  
  trait LexerActionExecutor extends StObject {
    
    /**
      * Caches the result of {@link hashCode} since the hash code is an element
      * of the performance-critical {@link LexerATNConfig.hashCode} operation
      */
    val cachedHashCode: Double
    
    def equals(other: LexerActionExecutor): Boolean
    
    /**
      * Execute the actions encapsulated by this executor within the context of a
      * particular {@link Lexer}.
      *
      * This method calls {@link IntStream//seek} to set the position of the
      * {@code input} {@link CharStream} prior to calling {@link LexerAction.execute}
      * on a position-dependent action. Before the method returns, the input position
      * will be restored to the same position it was in when the method was invoked.
      *
      * @param lexer The lexer instance.
      * @param input The input stream which is the source for the current token.
      * When this method is called, the current {@link IntStream.index} for
      * `input` should be the start of the following token, i.e. 1 character past
      * the end of the current token.
      * @param startIndex The token start index. This value may be passed to
      * {@link IntStream.seek} to set the `input` position to the beginning
      * of the token.
      */
    def execute(
      lexer: typings.antlr4.lexerMod.default,
      input: typings.antlr4.inputStreamMod.default,
      startIndex: Double
    ): Unit
    
    /**
      * Creates a {@link LexerActionExecutor} which encodes the current offset
      * for position-dependent lexer actions.
      *
      * Normally, when the executor encounters lexer actions where
      * {@link LexerAction.isPositionDependent} returns `true`, it calls
      * {@link IntStream.seek} on the input {@link CharStream} to set the input
      * position to the _end_ of the current token. This behavior provides
      * for efficient DFA representation of lexer actions which appear at the end
      * of a lexer rule, even when the lexer rule matches a variable number of
      * characters.
      *
      * Prior to traversing a match transition in the ATN, the current offset
      * from the token start index is assigned to all position-dependent lexer
      * actions which have not already been assigned a fixed offset. By storing
      * the offsets relative to the token start index, the DFA representation of
      * lexer actions which appear in the middle of tokens remains efficient due
      * to sharing among tokens of the same length, regardless of their absolute
      * position in the input stream.
      *
      * If the current executor already has offsets assigned to all
      * position-dependent lexer actions, the method returns `this`.
      *
      * @param offset The current offset to assign to all position-dependent
      * lexer actions which do not already have offsets assigned.
      *
      * @return A {@link LexerActionExecutor} which stores input stream offsets
      * for all position-dependent lexer actions.
      */
    def fixOffsetBeforeMatch(offset: Double): LexerActionExecutor
    
    val lexerActions: js.Array[typings.antlr4.actionLexerActionMod.default]
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit
  }
  object LexerActionExecutor {
    
    inline def apply(
      cachedHashCode: Double,
      equals_ : LexerActionExecutor => Boolean,
      execute: (typings.antlr4.lexerMod.default, typings.antlr4.inputStreamMod.default, Double) => Unit,
      fixOffsetBeforeMatch: Double => LexerActionExecutor,
      lexerActions: js.Array[typings.antlr4.actionLexerActionMod.default],
      updateHashCode: typings.antlr4.miscHashCodeMod.default => Unit
    ): LexerActionExecutor = {
      val __obj = js.Dynamic.literal(cachedHashCode = cachedHashCode.asInstanceOf[js.Any], execute = js.Any.fromFunction3(execute), fixOffsetBeforeMatch = js.Any.fromFunction1(fixOffsetBeforeMatch), lexerActions = lexerActions.asInstanceOf[js.Any], updateHashCode = js.Any.fromFunction1(updateHashCode))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[LexerActionExecutor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LexerActionExecutor] (val x: Self) extends AnyVal {
      
      inline def setCachedHashCode(value: Double): Self = StObject.set(x, "cachedHashCode", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: LexerActionExecutor => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setExecute(value: (typings.antlr4.lexerMod.default, typings.antlr4.inputStreamMod.default, Double) => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
      
      inline def setFixOffsetBeforeMatch(value: Double => LexerActionExecutor): Self = StObject.set(x, "fixOffsetBeforeMatch", js.Any.fromFunction1(value))
      
      inline def setLexerActions(value: js.Array[typings.antlr4.actionLexerActionMod.default]): Self = StObject.set(x, "lexerActions", value.asInstanceOf[js.Any])
      
      inline def setLexerActionsVarargs(value: typings.antlr4.actionLexerActionMod.default*): Self = StObject.set(x, "lexerActions", js.Array(value*))
      
      inline def setUpdateHashCode(value: typings.antlr4.miscHashCodeMod.default => Unit): Self = StObject.set(x, "updateHashCode", js.Any.fromFunction1(value))
    }
  }
}
