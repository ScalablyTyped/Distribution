package typings.angularCompilerCli

import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.ConcreteDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.Decorator
import typings.angularCompilerCli.srcHostMod.InlineDeclaration
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.srcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.Declaration
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccHostMod {
  
  @js.native
  trait ClassSymbol
    extends StObject
       with Symbol {
    
    @JSName("valueDeclaration")
    var valueDeclaration_ClassSymbol: ClassDeclaration[DeclarationNode] = js.native
  }
  
  trait NgccClassSymbol extends StObject {
    
    /**
      * Represents the symbol corresponding to a variable within a class IIFE that may be used to
      * attach static properties or decorated.
      */
    var adjacent: js.UndefOr[SymbolWithValueDeclaration] = js.undefined
    
    /**
      * Represents the symbol corresponding with the outer declaration of the class. This should be
      * considered the public class symbol, i.e. its declaration is visible to the rest of the program.
      */
    var declaration: ClassSymbol
    
    /**
      * Represents the symbol corresponding with the inner declaration of the class, referred to as its
      * "implementation". This is not necessarily a `ClassSymbol` but rather just a `ts.Symbol`, as the
      * inner declaration does not need to satisfy the requirements imposed on a publicly visible class
      * declaration.
      */
    var implementation: SymbolWithValueDeclaration
    
    /**
      * The name of the class.
      */
    var name: String
  }
  object NgccClassSymbol {
    
    inline def apply(declaration: ClassSymbol, implementation: SymbolWithValueDeclaration, name: String): NgccClassSymbol = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgccClassSymbol]
    }
    
    extension [Self <: NgccClassSymbol](x: Self) {
      
      inline def setAdjacent(value: SymbolWithValueDeclaration): Self = StObject.set(x, "adjacent", value.asInstanceOf[js.Any])
      
      inline def setAdjacentUndefined: Self = StObject.set(x, "adjacent", js.undefined)
      
      inline def setDeclaration(value: ClassSymbol): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setImplementation(value: SymbolWithValueDeclaration): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NgccReflectionHost
    extends StObject
       with ReflectionHost {
    
    /**
      * Check whether a `Declaration` corresponds with a known declaration and set its `known` property
      * to the appropriate `KnownDeclaration`.
      *
      * @param decl The `Declaration` to check.
      * @return The passed in `Declaration` (potentially enhanced with a `KnownDeclaration`).
      */
    def detectKnownDeclaration(decl: ConcreteDeclaration[Declaration]): ConcreteDeclaration[Declaration] = js.native
    def detectKnownDeclaration(decl: InlineDeclaration): InlineDeclaration = js.native
    
    /**
      * Retrieves all class symbols of a given source file.
      * @param sourceFile The source file to search for classes.
      * @returns An array of found class symbols.
      */
    def findClassSymbols(sourceFile: SourceFile): js.Array[NgccClassSymbol] = js.native
    
    /**
      * Find a symbol for a declaration that we think is a class.
      * @param declaration The declaration whose symbol we are finding
      * @returns the symbol for the declaration or `undefined` if it is not
      * a "class" or has no symbol.
      */
    def getClassSymbol(declaration: Node): js.UndefOr[NgccClassSymbol] = js.native
    
    /**
      * Retrieves all decorators of a given class symbol.
      * @param symbol Class symbol that can refer to a declaration which can hold decorators.
      * @returns An array of decorators or null if none are declared.
      */
    def getDecoratorsOfSymbol(symbol: NgccClassSymbol): js.Array[Decorator] | Null = js.native
    
    /**
      * Find the last node that is relevant to the specified class.
      *
      * As well as the main declaration, classes can have additional statements such as static
      * properties (`SomeClass.staticProp = ...;`) and decorators (`__decorate(SomeClass, ...);`).
      * It is useful to know exactly where the class "ends" so that we can inject additional
      * statements after that point.
      *
      * @param classSymbol The class whose statements we want.
      */
    def getEndOfClass(classSymbol: NgccClassSymbol): Node = js.native
  }
}
