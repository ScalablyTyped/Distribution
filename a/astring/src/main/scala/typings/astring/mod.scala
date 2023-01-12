package typings.astring

import typings.node.streamMod.Writable
import typings.sourceMap.mod.Mapping
import typings.sourceMap.mod.SourceMapGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("astring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("astring", "GENERATOR")
  @js.native
  val GENERATOR_ : Generator = js.native
  
  @JSImport("astring", "baseGenerator")
  @js.native
  val baseGenerator: Generator = js.native
  
  inline def generate(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generate(node: Node, options: Options[Null]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generate_Writable(node: Node): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def generate_Writable(node: Node, options: Options[Writable]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ T in estree.estree.Node['type'] ]: (node : estree.estree.Node & {  type :T}, state : astring.astring.State): void}
    }}}
    */
  @js.native
  trait Generator extends StObject
  
  /**
    * Core Estree Node type to accommodate derived node types from parsers.
    */
  trait Node extends StObject {
    
    var `type`: String
  }
  object Node {
    
    inline def apply(`type`: String): Node = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[Output] extends StObject {
    
    /**
      * Generate comments if `true`, defaults to `false`.
      */
    var comments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom code generator logic.
      */
    var generator: js.UndefOr[Generator] = js.undefined
    
    /**
      * String to use for indentation, defaults to `"␣␣"`.
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * String to use for line endings, defaults to `"\n"`.
      */
    var lineEnd: js.UndefOr[String] = js.undefined
    
    /**
      * Output stream to write the render code to, defaults to `null`.
      */
    var output: js.UndefOr[Output] = js.undefined
    
    /**
      * If present, source mappings will be written to the generator.
      */
    var sourceMap: js.UndefOr[SourceMapGenerator] = js.undefined
    
    /**
      * Indent level to start from, defaults to `0`.
      */
    var startingIndentLevel: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[Output](): Options[Output] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Output]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Output] (val x: Self & Options[Output]) extends AnyVal {
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setGenerator(value: Generator): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setLineEnd(value: String): Self = StObject.set(x, "lineEnd", value.asInstanceOf[js.Any])
      
      inline def setLineEndUndefined: Self = StObject.set(x, "lineEnd", js.undefined)
      
      inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setSourceMap(value: SourceMapGenerator): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStartingIndentLevel(value: Double): Self = StObject.set(x, "startingIndentLevel", value.asInstanceOf[js.Any])
      
      inline def setStartingIndentLevelUndefined: Self = StObject.set(x, "startingIndentLevel", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var column: js.UndefOr[Double] = js.native
    
    var indent: String = js.native
    
    var indentLevel: Double = js.native
    
    var line: js.UndefOr[Double] = js.native
    
    var lineEnd: String = js.native
    
    var lineEndSize: js.UndefOr[Double] = js.native
    
    var mapping: js.UndefOr[Mapping] = js.native
    
    var output: String = js.native
    
    def write(code: String): Unit = js.native
    def write(code: String, node: typings.estree.mod.Node): Unit = js.native
    
    var writeComments: Boolean = js.native
  }
}
