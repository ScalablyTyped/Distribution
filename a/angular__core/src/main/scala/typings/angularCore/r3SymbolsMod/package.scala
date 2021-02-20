package typings.angularCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object r3SymbolsMod {
  
  /**
    * An object literal of this type is used to represent the metadata of a constructor dependency.
    * The type itself is never referred to from generated code.
    */
  type CtorDependency = typings.angularCore.anon.Attribute | scala.Null
  
  @scala.inline
  def ITS_JUST_ANGULAR: /* true */ scala.Boolean = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].selectDynamic("ITS_JUST_ANGULAR").asInstanceOf[/* true */ scala.Boolean]
  
  /**
    * Describes how an `Injector` should be configured as static (that is, without reflection).
    * A static provider provides tokens to an injector for various types of dependencies.
    *
    * @see [Injector.create()](/api/core/Injector#create).
    * @see ["Dependency Injection Guide"](guide/dependency-injection-providers).
    *
    * @publicApi
    */
  /* Rewritten from type alias, can be one of: 
    - typings.angularCore.r3SymbolsMod.ValueProvider
    - typings.angularCore.r3SymbolsMod.ExistingProvider
    - typings.angularCore.r3SymbolsMod.StaticClassProvider
    - typings.angularCore.r3SymbolsMod.ConstructorProvider
    - typings.angularCore.r3SymbolsMod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = typings.angularCore.r3SymbolsMod._StaticProvider | js.Array[js.Any]
  
  @scala.inline
  def setClassMetadata(`type`: typings.angularCore.r3SymbolsMod.Type[_]): scala.Unit = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setClassMetadata(`type`: typings.angularCore.r3SymbolsMod.Type[_], decorators: js.Array[_]): scala.Unit = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setClassMetadata(
    `type`: typings.angularCore.r3SymbolsMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setClassMetadata(
    `type`: typings.angularCore.r3SymbolsMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setClassMetadata(
    `type`: typings.angularCore.r3SymbolsMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setClassMetadata(
    `type`: typings.angularCore.r3SymbolsMod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setClassMetadata(
    `type`: typings.angularCore.r3SymbolsMod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setClassMetadata(
    `type`: typings.angularCore.r3SymbolsMod.Type[_],
    decorators: scala.Null,
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵnoSideEffects[T](fn: js.Function0[T]): T = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275noSideEffects")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type ɵɵFactoryDef[T, CtorDependencies /* <: js.Array[typings.angularCore.r3SymbolsMod.CtorDependency] */] = js.Function0[T]
  
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = typings.angularCore.r3SymbolsMod.NgModuleDef[T]
  
  @scala.inline
  def ɵɵdefineInjectable[T](opts: typings.angularCore.anon.Token[T]): scala.Nothing = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjectable")(opts.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineInjector(options: typings.angularCore.anon.Imports): scala.Nothing = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjector")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineNgModule[T](`def`: typings.angularCore.anon.Exports[T]): scala.Nothing = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineNgModule")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵinject[T](token: typings.angularCore.r3SymbolsMod.InjectionToken[T]): T | scala.Null = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](
    token: typings.angularCore.r3SymbolsMod.InjectionToken[T],
    flags: typings.angularCore.r3SymbolsMod.InjectFlags
  ): T | scala.Null = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](token: typings.angularCore.r3SymbolsMod.Type[T]): T | scala.Null = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](
    token: typings.angularCore.r3SymbolsMod.Type[T],
    flags: typings.angularCore.r3SymbolsMod.InjectFlags
  ): T | scala.Null = (typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  
  @scala.inline
  def ɵɵinject_T_T[T](token: typings.angularCore.r3SymbolsMod.InjectionToken[T]): T = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵɵinject_T_T[T](token: typings.angularCore.r3SymbolsMod.Type[T]): T = typings.angularCore.r3SymbolsMod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
}
