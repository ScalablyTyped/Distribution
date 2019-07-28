package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.adone.adoneNs.streamNs.coreNs.INs.ConstructorOptions
import typings.adone.adoneNs.streamNs.coreNs.INs.Source
import typings.adone.adoneNs.streamNs.coreNs.Stream
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassStream
  extends Instantiable0[Stream[js.Object, js.Object]]
     with Instantiable1[
      /* source */ Source[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      Stream[js.Object, js.Object]
    ]
     with Instantiable2[
      /* source */ Source[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      /* options */ ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      Stream[js.Object, js.Object]
    ] {
   // ??
  /**
    * Merges the given stream into a core stream
    */
  def merge[S, T](streams: js.Array[(Stream[_, _]) | Transform | Readable | Duplex]): Stream[S, T] = js.native
  def merge[S, T](
    streams: js.Array[(Stream[_, _]) | Transform | Readable | Duplex],
    options: Anon_EndSourceOptions[S, T]
  ): Stream[S, T] = js.native
}

