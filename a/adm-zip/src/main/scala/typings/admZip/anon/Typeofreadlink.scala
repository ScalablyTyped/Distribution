package typings.admZip.anon

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofreadlink extends StObject {
  
  def apply(
    path: PathLike,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* linkString */ String, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* linkString */ Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: EncodingOption,
    callback: js.Function2[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      Buffer | (/* linkString */ String), 
      Unit
    ]
  ): Unit = js.native
}
