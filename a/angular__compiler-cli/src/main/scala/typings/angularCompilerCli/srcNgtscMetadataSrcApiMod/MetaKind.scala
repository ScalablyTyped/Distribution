package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetaKind extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/api", "MetaKind")
@js.native
object MetaKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetaKind & Double] = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with MetaKind
  /* 0 */ val Directive: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Directive & Double = js.native
  
  @js.native
  sealed trait NgModule
    extends StObject
       with MetaKind
  /* 2 */ val NgModule: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.NgModule & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with MetaKind
  /* 1 */ val Pipe: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Pipe & Double = js.native
}
