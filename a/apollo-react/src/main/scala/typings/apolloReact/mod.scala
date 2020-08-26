package typings.apolloReact

import typings.apolloReact.anon.Children
import typings.apolloReact.anon.Client
import typings.apolloReact.graphqlMod.OperationOption
import typings.redux.mod.Func0
import typings.redux.mod.Func1
import typings.redux.mod.Func2
import typings.redux.mod.Func3
import typings.typedGraphql.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ApolloProvider protected ()
    extends typings.apolloReact.browserMod.ApolloProvider {
    def this(props: js.Any, context: js.Any) = this()
  }
  
  def compose(): js.Function1[/* a */ js.Any, _] = js.native
  def compose[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[F /* <: js.Function */](f: F): F = js.native
  def compose[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[A, R](f1: js.Function1[/* b */ A, R], f2: Func0[A]): Func0[R] = js.native
  def compose[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func0[A]): Func0[R] = js.native
  def compose[A, T1, R](f1: js.Function1[/* b */ A, R], f2: Func1[T1, A]): Func1[T1, R] = js.native
  def compose[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func0[A]
  ): Func0[R] = js.native
  def compose[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func1[T1, A]): Func1[T1, R] = js.native
  def compose[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  def compose[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func1[T1, A]
  ): Func1[T1, R] = js.native
  def compose[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  def compose[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func2[T1, T2, A]
  ): Func2[T1, T2, R] = js.native
  def compose[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func3[T1, T2, T3, A]
  ): Func3[T1, T2, T3, R] = js.native
  def getDataFromTree(rootElement: js.Any): js.Promise[Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.UndefOr[scala.Nothing], fetchRoot: Boolean): js.Promise[Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.Any): js.Promise[Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.Any, fetchRoot: Boolean): js.Promise[Unit] = js.native
  def graphql(document: Document): js.Function1[/* WrappedComponent */ js.Any, _] = js.native
  def graphql(document: Document, operationOptions: OperationOption): js.Function1[/* WrappedComponent */ js.Any, _] = js.native
  def renderToStringWithData(component: js.Any): js.Promise[String] = js.native
  def withApollo(WrappedComponent: js.Any): js.Any = js.native
  /* static members */
  @js.native
  object ApolloProvider extends js.Object {
    var childContextTypes: Client = js.native
    var propTypes: Children = js.native
  }
  
}

