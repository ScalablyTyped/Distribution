package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MatchSource extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/api", "MatchSource")
@js.native
object MatchSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatchSource & Double] = js.native
  
  /** The directive was applied as a host directive. */
  @js.native
  sealed trait HostDirective
    extends StObject
       with MatchSource
  /* 1 */ val HostDirective: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MatchSource.HostDirective & Double = js.native
  
  /** The directive was matched by its selector. */
  @js.native
  sealed trait Selector
    extends StObject
       with MatchSource
  /* 0 */ val Selector: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MatchSource.Selector & Double = js.native
}
